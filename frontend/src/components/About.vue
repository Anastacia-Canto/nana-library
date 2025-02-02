<script setup>
import AboutItem from './AboutItem.vue'
</script>

<template>
  <AboutItem>
   
    <template #icon>
      <v-icon>mdi-account-circle</v-icon>
    </template>
    <template #heading>Who am I?</template>

    My name is Anastácia, but some lovely friends call me Nana.<br>
    I am 35 years old and mother of two beautiful girls.
  </AboutItem>

  <AboutItem>
    <template #icon>
      <v-icon>mdi-briefcase</v-icon>
    </template>
    <template #heading>Career</template>

    Passionate about challenges, I've spent 16 years of my life studying Chemistry and contributing to scientific research.<br>
    Now I am focused on new challenges in the vast field of programming.<br>
    More about my way so far on <a href="https://www.linkedin.com/in/anast%C3%A1cia-silva-canto-1a1463206/">LinkedIn</a>.
  </AboutItem>

  <AboutItem>
    <template #icon>
      <v-icon>mdi-code-tags</v-icon>
    </template>
    <template #heading>Projects</template>

    I've been developing some small projects:<br><br>

    <a href="https://github.com/Anastacia-Canto/nana-library">Nana's Library</a> (Java, VueJS) <br>
    <a href="https://github.com/Tiagochicoo/ft_transcendence">Transcendence</a> (JavaScript, Django, Web Application) <br>
    <a href="https://github.com/Anastacia-Canto/inception">Inception</a> (Docker, MariaDB, Containerization) <br>
    <a href="https://github.com/Anastacia-Canto/ft_irc">IRC Server</a> (C++, Socket) <br>
    <a href="https://github.com/Anastacia-Canto/minishell">MiniShell</a> (C, Linux) <br> <br>
    
    

    Other projects on <a href="https://github.com/Anastacia-Canto">GitHub</a>.

    
  </AboutItem>

  <AboutItem>
    <template #icon>
      <v-icon>mdi-card-account-mail</v-icon>
    </template>
    <template #heading>Contact</template>

    anastacia.s.canto@gmail
  </AboutItem>
</template>
