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
			dialog: false,
			suggestions: suggestionStore.suggestionList,
		}
	},
	methods: {
		register() {
			if (this.suggestion.name != "" && this.suggestion.title != "" && this.suggestion.author != ""){
				console.log("All good!");
				//send to database
			} else {
				this.dialog = true;
			}
		}
	}
}
</script>
<template>

<div class="page">
	<div>
		<v-card class="form" color="#e5f1c4">
			<v-card-title>
				Send me your book recommendation!
			</v-card-title>
			<v-card-subtitle>
				Because good readings must be shared!
			</v-card-subtitle>
			<v-card-text>
				<form name="suggestion-form">
					<div>
						<v-text-field label="Your name" v-model="suggestion.name"></v-text-field>
						<v-text-field label="Title" v-model="suggestion.title"></v-text-field>		
						<v-text-field label="Author" v-model="suggestion.author"></v-text-field>
					</div>
				</form>
			</v-card-text>
			<v-card-actions>
				<v-spacer></v-spacer>
				<v-btn class="form-btn" type="submit" @click.prevent="register">Submit</v-btn>
			</v-card-actions>
		</v-card>
	</div>
			
	<div class="suggestions">
		<!-- The <hr> element is most often displayed as a horizontal rule that is used to separate content (or define a change) in an HTML page. -->
		<hr class="divisor"/>

		<v-container fluid>
			<v-row dense>
				<v-col
				v-for="suggestion in suggestions"
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
	v-model="dialog"
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
            @click="dialog = false"
          ></v-btn>
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

.form-btn {
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