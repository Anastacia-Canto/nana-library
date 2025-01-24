<script setup>

import { useBookStore } from '@/stores/books';

const bookStore = useBookStore();

if (bookStore.booksList.length === 0) await bookStore.getBooks();

const cards = bookStore.booksList;

</script>
<template>
	<v-card
	  class="mx-auto"
	  max-width="1600"
	>
	  <v-container fluid>
		<v-row dense>
		  <v-col
			v-for="card in cards"
			:key="card.title"
			:cols="card.flex"
			md="4"
		  >
			<v-card 
			:to="'/books/' + card.id"
			title="Book"
			color="transparent"
			>
			  <v-img
				:src="card.src"
				class="align-end"
				gradient="to bottom, rgba(0,0,0,.1), rgba(0,0,0,.5)"
				height="200px"
				cover
			  >
				<v-card-title class="text-white" v-text="card.title"></v-card-title>
			  </v-img>
  
			  <v-card-actions>
				<v-spacer></v-spacer>
  
				<v-btn
				  color="medium-emphasis"
				  icon="mdi-heart"
				  size="small"
				></v-btn>
  
				<v-btn
				  color="medium-emphasis"
				  icon="mdi-bookmark"
				  size="small"
				></v-btn>
  
				<v-btn
				  color="medium-emphasis"
				  icon="mdi-share-variant"
				  size="small"
				></v-btn>
			  </v-card-actions>
			</v-card>
		  </v-col>
		</v-row>
	  </v-container>
	</v-card>
  </template>

<style>


</style>

<!-- [ { 
		"id": 1, 
		"title": "Conversas Corajosas", 
		"authors": [ "Elisama Santos" ], 
		"publisher": "Paz e Terra" 
	}, 
	{ 
		"id": 2, 
		"title": "Finding me", 
		"authors": [ "Viola Davis" ], 
		"publisher": "Harper Collins" 
	}, 
	{ 
		"id": 3, 
		"title": "The Whole-Brain Child", 
		"authors": [ "Daniel J. Siegel", "Tina Payne Bryson" ], 
		"publisher": "Bantam Dell" 
	}, 
	{ 
		"id": 4, 
		"title": "Diário de uma paixão", 
		"authors": [ "Nicholas Sparks" ], 
		"publisher": "Warner Books" 
	} ] -->