<script setup>
import { RouterLink, RouterView } from 'vue-router'
import Quotes from './components/Quotes.vue'
import { ref } from 'vue'

let drawer = ref(null);

</script>

<template>
  <v-app>

    <v-app-bar app>
      <v-toolbar-title>Nana's Library</v-toolbar-title>
    </v-app-bar>

      <v-navigation-drawer
      v-model="drawer"
      expand-on-hover
      permanent
      rail
      app
      color="#e5f1c4"
    >
      <v-list>
          <v-list-item class="px-2" 
          prepend-avatar="/anastacia.jpg"
          subtitle="anaanestesia@gmail.com"
          title="Anastácia Canto"
          ></v-list-item>

        </v-list>

        <v-divider></v-divider>

        <v-list
          nav
          dense
        >
          <v-list-item to="/"
          prepend-icon="mdi-home"
          title="Home"
          ></v-list-item>
          <v-list-item to="/books"
          prepend-icon="mdi-library"
          title="Books"
          ></v-list-item>
          <v-list-item to="/about"
          prepend-icon="mdi-information-variant"
          title="About"
          ></v-list-item>
        </v-list>
    </v-navigation-drawer>

    <v-main class="main">
        <div>
          <Suspense>
            <Quotes />
          </Suspense>
          <Suspense>
            <RouterView />
          </Suspense>
        </div> 
    </v-main>
  </v-app>
</template>

<style scoped>

.main {
  width: 80vw;
  display: flex;
}

</style>
