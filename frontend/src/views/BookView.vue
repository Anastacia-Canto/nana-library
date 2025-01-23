<script setup>
	import { storeToRefs } from 'pinia';
	import { useBookStore } from '@/stores/books';

	const bookStore = useBookStore();
	const { getBookById } = storeToRefs(bookStore);

</script>

<template>
	<h1>BookView</h1>
	<div>
		Book: {{ $route.params.id }}
		teste: {{ getBookById($route.params.id).title }}
		{{ bookStore.isFetched }}
	</div>
</template>