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
	<h1>{{ book.title }}</h1>
	<div class="book">
		<v-img
				:src="`/${book.src}`"
				min-width="300px"
				position="left top"
			>
		</v-img>
		
		<div class="about">
			Author: {{ book.author }}<br>
			Publisher: {{ book.publisher }}<br>
			Category: {{ book.category }}<br><br>
			
			{{ book.description }}
		</div>

	</div>
	
	<div class="link">You can buy the book <a :href="book.link">here</a>.</div>
</template>

<style>

h1 {
	padding-bottom: 30px;
}

.book {
	display: flex;
}

.about {
	padding-left: 20px;
	font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
	font-size: large;
	text-align: justify;
}

.link {
	margin-top: 30px;
	font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
	font-size: large;
}

</style>