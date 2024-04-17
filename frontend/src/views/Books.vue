<script>

	export default {
		async setup() {
			const res = await fetch('http://localhost:8080/api/books');
			let books = await res.json();
			console.log(books);

			return {
				books
			}
		},

	}
</script>
<template>
	<div>
		<p>Test</p>
		{{ books }}
	</div>
</template>
