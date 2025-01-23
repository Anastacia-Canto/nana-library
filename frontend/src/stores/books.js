import { ref, computed } from 'vue'
import { defineStore } from 'pinia'

export const useBookStore = defineStore('books', {
	state: () => ({
		booksList: [],
		isFetched: false,
	}),
	getters: {
		getBookById(state) {
			if (!state.isFetched) this.getBooks();
			return (id) => state.booksList.find(book => book.id == id)
		},
	},
	actions: {
		async getBooks() {
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

			this.isFetched = true;
		},
	}
})