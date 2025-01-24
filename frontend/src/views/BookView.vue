<script setup>
	import { useBookStore } from '@/stores/books';
	import { useRoute } from 'vue-router';

	const bookStore = useBookStore();

	const route = useRoute();
	const id = route.params.id;
	
	if (bookStore.booksList.length === 0) await bookStore.getBooks();

	const book = bookStore.booksList.find(book => book.id == id);
		

</script>

<template>
	<h1>BookView</h1>
	<div>
		Book: {{ $route.params.id }}
		{{ book.title }}
		
	
		
	</div>
</template>