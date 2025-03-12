<script>
	
export default {
	name: 'Form',
	data() {
		return {
			suggestion: {
				title: "",
				author: ""
			}
		}
	},
	methods: {
		register() {
			if (this.suggestion.title != "" && this.suggestion.author != ""){
				console.log("All good!");
			} else {
				console.log("Empty fields");
			}
			
			// this is becoming as a Proxy. Fix it!!
			console.log(this.suggestion.author);
		}
	}
}
</script>
<template>
	<form name="suggestion-form">
		<div class="form">
			<v-text-field label="Title" v-model="suggestion.title"></v-text-field>		
			<v-text-field label="Author" v-model="suggestion.author"></v-text-field>
		</div>
		<v-btn block type="submit" @click.prevent="register">Submit</v-btn>

	</form>
	
</template>

<style>

.form {
	width: 300px;
}

</style>