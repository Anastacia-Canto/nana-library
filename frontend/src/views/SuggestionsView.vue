<script>

import { useSuggestionStore } from '@/stores/suggestions';

const suggestionStore = useSuggestionStore();

if (suggestionStore.suggestionList.length === 0) await suggestionStore.getSuggestions();


export default {
	data() {
		return {
			suggestion: {
				name: "",
				title: "",
				author: ""
			},
			errorDialog: false,
			confirmDialog: false,
			recommendedBooks: suggestionStore.suggestionList,
		}
	},
	methods: {
		async register() {
			if (this.suggestion.name != "" && this.suggestion.title != "" && this.suggestion.author != ""){
				const res = await suggestionStore.postSuggestion(this.suggestion);
				if (res) {
					this.recommendedBooks.push(this.suggestion);
					this.$refs.form.reset();
					this.confirmDialog = false;
				}
			} else {
				this.errorDialog = true;
			}
		}
	}
}
</script>
<template>

<div class="page">
	<div>
		<v-card class="form" color="#e5f1c4" >
			<v-card-title>
				Send me your book recommendation!
			</v-card-title>
			<v-card-subtitle>
				Because good readings must be shared!
			</v-card-subtitle>
			<v-card-text>
				<form ref="form" name="suggestion-form">
					<div>
						<v-text-field clearable label="Your name" v-model="suggestion.name"></v-text-field>
						<v-text-field clearable label="Title" v-model="suggestion.title"></v-text-field>		
						<v-text-field clearable label="Author" v-model="suggestion.author"></v-text-field>
					</div>
				</form>
			</v-card-text>
			<v-card-actions>
				<v-spacer></v-spacer>
				<v-btn class="form-btn" type="submit" @click="confirmDialog = true">Submit</v-btn>
			</v-card-actions>
		</v-card>
	</div>
			
	<div class="suggestions">
		<!-- The <hr> element is most often displayed as a horizontal rule that is used to separate content (or define a change) in an HTML page. -->
		<hr class="divisor"/>

		<v-container fluid>
			<v-row dense>
				<v-col
				v-for="suggestion in recommendedBooks"
				:key="suggestion.title"
				cols="12"
				md="4"
				>
					<v-card
					:title="suggestion.title"
					:subtitle="suggestion.author"
					:text="`This book was suggested by ${suggestion.name}.`"
					>
					</v-card>
				</v-col>
			</v-row>
		</v-container>
		
	</div>
</div>


	<v-dialog
	v-model="errorDialog"
	width="auto"
	>
		<v-card
		max-width="400"
        prepend-icon="mdi-alert-circle-outline"
        text="No empty fields allowed."
        title="Error"
		>
		<v-btn
            class="ms-auto"
            text="Ok"
            @click="errorDialog = false"
          ></v-btn>
		</v-card>
	</v-dialog>

	<v-dialog
	v-model="confirmDialog"
	width="auto"
	>
		<v-card
		min-width="500"
		prepend-icon="mdi-check-circle-outline"
		title="Review your suggestion:"
		>
			<v-card-text class="pt-3">
				Title: {{ suggestion.title }}
				
			</v-card-text>
			<v-card-text class="pb-3">
				Author: {{ suggestion.author }}
			</v-card-text>
			<v-card-actions class="px-3">
				
				<v-btn class="dialog-btn" @click="confirmDialog = false">Delete</v-btn>
				<v-spacer></v-spacer>
				<v-btn class="dialog-btn" @click.prevent="register">Submit</v-btn>
				
			</v-card-actions>
		</v-card>
	</v-dialog>
	
</template>

<style>

.page {
	display: flex;
	flex-direction: column;
	align-items: center;
	width: 100vw;
	left: 20px;
}

.form {
	top: 100px;
	width: 60vw;
	position: inherit;
}

.form-btn, .dialog-btn {
	background-color: #5b604e;
	color: #e5f1c4;
}

.divisor {
	border-top: 3px solid #5b604e;
  	border-radius: 10px;
	margin-top: 60px;
	margin-bottom: 60px;
	width: 100vw;
}

.suggestions {
	padding-left: 80px;
}



</style>