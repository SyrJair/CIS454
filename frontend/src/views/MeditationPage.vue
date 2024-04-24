<template>
  <div id="entire-meditation-page">
    <h1 id="meditation-title">Meditate</h1>
    <RouterLink to="/" id="logout" class="button">Logout</RouterLink>
    <RouterLink to="/Main" id="home-button" class="button">Home</RouterLink>
    <!-- ENCAPSULATED CODE BELOW UPDATE WP-->
    <Carousel :items-to-show="1.5" :wrap-around="true" :autoplay="2000" id="carousel">
      <Slide v-for="slide in 10" :key="slide">
        <div class="carousel__item">{{ slide }}</div>
      </Slide>
      <!-- ENCAPSULATED CODE BELOW UPDATE WP-->
      <template v-slot:addons>
        <Navigation />
        <Pagination />
      </template>
    </Carousel>
  </div>
</template>

<script>
  import 'vue3-carousel/dist/carousel.css';
  import { Carousel, Slide, Pagination, Navigation } from 'vue3-carousel';

  export default {
    name: 'MeditationPage',
    components: {
      Carousel,
      Slide,
      Pagination,
      Navigation
    },
  }
</script>

<style scoped>
  #entire-meditation-page {
    height: 100vh;
    display: flex;
    justify-content: center;
    background-image: url('../assets/sunrise.jpg');
    background-repeat: no-repeat;  
    background-size: cover;        
    background-position: center;
    -webkit-backdrop-filter: blur(5px);  
    backdrop-filter: blur(5px);
  }
  #meditation-title {
    margin: 3% auto 0 auto;
    position: absolute;
    font-weight: bold;
    padding: 5px;
    font-size: calc(1em + 0.5vw); 
  }
  .button {
    position: absolute;
    z-index: 4;
    text-decoration: none;
    color: white;
    font-weight: bold;
    font-size: calc(1em + 0.2vw); 
    padding: 10px;
    border: none;
    background-color: black;
    transition: background-color 0.3s; 
  }
  .button:hover {
    background-color: rgba(75, 75, 75, 0); 
  }
  #home-button {
    right: 5%;  
    top: 1%;
    background-color: black;
  }
  #logout {
    left: 5%;  
    top: 1%;
  }
  #carousel {
    height: 80%;
    width: 80%;
    margin-top: 10%;
  }
  .carousel__item {
    min-height: 200px;
    width: 100%;
    background-color: white; 
    color: black; 
    font-size: 20px;
    border-radius: 8px;
    display: flex;
    justify-content: center;
    align-items: center;
  }
  .carousel__slide {
    padding: 10px;
  }
  .carousel__prev, .carousel__next {
    box-sizing: content-box;
    border: 5px solid white;
  }
</style>

