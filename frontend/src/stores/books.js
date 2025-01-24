import { ref, computed } from 'vue'
import { defineStore } from 'pinia'

export const useBookStore = defineStore('books', {
	state: () => ({
		booksList: [],
	}),
	getters: {
		async getBookById(state) {
			if (this.booksList.length === 0) await this.getBooks();
			return (id) => state.booksList.find(book => book.id == id)
		},
	},
	actions: {
		async getBooks() {
			if (this.booksList.length === 0) {
				const res = await fetch('http://localhost:8080/api/books');
				let books = await res.json();
	
				for (const e in books) {
					this.booksList.push({
						id: books[e].id,
						title: books[e].title,
						src: books[e].imageName,
						flex: 12,
					});
				}
			}
		},
	}
})