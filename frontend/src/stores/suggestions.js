import { defineStore } from 'pinia';


export const useSuggestionStore = defineStore('suggestions', {
	state: () => ({
		suggestionList: [],
	}),
	actions: {
		async getSuggestions() {
			if (this.suggestionList.length === 0) {
				const res = await fetch('http://localhost:8080/api/suggestions');

				let suggestions = await res.json();

				for(const e in suggestions) {
					this.suggestionList.push({
						id: suggestions[e].id,
						title: suggestions[e].title,
						author: suggestions[e].authors[0],
						name: suggestions[e].name,
					});
				}
			}
		},
		async postSuggestion(suggestion) {
			try{
				const res = await fetch('http://localhost:8080/api/suggestions', {
					method: 'POST',
					headers: {
						'Content-Type': 'application/json',
					},
					body: JSON.stringify({
						name: suggestion.name,
						title: suggestion.title,
						authors: [suggestion.author],
					})
				});

				const submitted = await res.json();
				return submitted;

			} catch (error) {
				console.error(error);
				return null;
			}


		}
	}
})