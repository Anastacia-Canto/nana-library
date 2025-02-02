<script setup>

let quotes;
// https://github.com/Sumansourabh14/recite
let res = await fetch("https://recite.onrender.com/random/quote-from-db");
if (!res) {
  quotes.quote = "A reader lives a thousand lives before he dies.";
  quotes.author = "George R. R. Martin";
  quotes.book = "A Dance With Dragons";
} else {
  quotes = await res.json();
}
</script>

<template>
  <div class="quotes mb-5">
    <h1 class="green">{{ quotes.quote }}</h1>
    <h3>
      {{ quotes.author }} - {{ quotes.book }}
    </h3>
  </div>
</template>

<style scoped>
h1 {
  font-weight: 500;
  font-size: 2.6rem;
  position: relative;
  top: -10px;
}

h3 {
  font-size: 1.2rem;
}

.quotes h1,
.quotes h3 {
  text-align: center;
}

@media (min-width: 1024px) {
  .quotes h1,
  .quotes h3 {
    text-align: left;
  }
}
</style>
