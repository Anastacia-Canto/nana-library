<script setup>
import TheWelcome from '../components/About.vue'
</script>

<template>
  <main>
    <div class="about">
      <h1>Nana's Library</h1>
      <p>Reading is a simple yet profound pleasure. It’s a journey of escape, where each page opens up new worlds, ideas, and emotions. The act of getting lost in a book offers a unique kind of peace, allowing you to experience someone else’s thoughts and stories while giving your mind a chance to wander freely. It’s not just about the story—it’s about the moments of reflection, discovery, and connection that come with each word.</p> <br>
      <p>This is where I can show some books I've read and have really enjoyed. So you can have a few information about the stories and get some tips to your next book adventure. </p><br>

      <v-img class="home-img" src="/home.jpg"></v-img>
    </div>
  </main>
</template>

<style>

.home-img {
  margin-bottom: 100px;
}

@media (min-width: 1024px) {
  .about {
    min-height: 100vh;
  }
}
</style>
