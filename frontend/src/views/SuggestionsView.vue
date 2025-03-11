<script>
	
export default {
	data() {
		return {
			suggestion: {
				name: "",
				title: "",
				author: ""
			},
			dialog: false,
		}
	},
	methods: {
		register() {
			if (this.suggestion.name != "" && this.suggestion.title != "" && this.suggestion.author != ""){
				console.log("All good!");
			} else {
				this.dialog = true;
			}
		}
	}
}
</script>
<template>
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

.form {
	top: 100px;
	width: 60vw;
}

.form-btn {
	background-color: #5b604e;
	color: #e5f1c4;
}

</style>