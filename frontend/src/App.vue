<script setup>
import { RouterView } from 'vue-router'
import { ref } from 'vue'
import { useTheme } from 'vuetify'


let drawer = ref(null);


const theme = useTheme();

function toggleTheme() {
  theme.global.name.value = theme.current._value.dark ? 'light' : 'dark';
  
};


</script>

<template>
  <v-app >

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
          prepend-avatar="/cover.jpg"
          title="Anastácia Canto"
          subtitle="Nana"
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
        <v-list-item to="/suggestions"
        prepend-icon="mdi-lightbulb-on-outline"
        title="Suggestions"
        ></v-list-item>
        <v-list-item to="/about"
        prepend-icon="mdi-information-variant"
        title="About"
        ></v-list-item>
      </v-list>

      <div class="toggle pa-3">
        <v-btn  max-width="30" max-height="30" icon @click="toggleTheme">
          <v-icon>mdi-theme-light-dark</v-icon>
        </v-btn>
      </div>
       
    </v-navigation-drawer>

    <v-main class="main mt-7">
        <div>
          <Suspense>
            <RouterView />
          </Suspense>
        </div> 
    </v-main>
  </v-app>
</template>

<style scoped>


.main {
  width: 95vw;
  display: flex;
  justify-content: center;
}

.toggle {
  position: absolute;
  bottom: 0;
}

</style>
