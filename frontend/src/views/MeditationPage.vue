<template>
  <!-- Main container for the meditation page -->
  <div id="entire-meditation-page">
    <!-- Title of the page -->
    <h1 id="meditation-title">Meditate</h1>
    <!-- Navigation links for logout and home -->
    <RouterLink to="/" id="logout" class="button">Logout</RouterLink>
    <RouterLink to="/Main" id="home-button" class="button">Home</RouterLink>
    <!-- Carousel component with autoplay functionality -->
    <!-- ENCAPSULATED CODE BELOW UPDATE WP-->
    <Carousel :items-to-show="1.5" :wrap-around="true" :autoplay="2000" id="carousel">
      <!-- Dynamically create slides based on a predefined number -->
      <Slide v-for="slide in 10" :key="slide">
        <!-- Content inside each slide -->
        <div class="carousel__item">{{ slide }}</div>
      </Slide>
      <!-- Additional components for navigation and pagination within the carousel -->
      <!-- ENCAPSULATED CODE BELOW UPDATE WP-->
      <template v-slot:addons>
        <Navigation />
        <Pagination />
      </template>
    </Carousel>
  </div>
</template>


<script>
// Import styles and components from library! 
  import 'vue3-carousel/dist/carousel.css';
  import { Carousel, Slide, Pagination, Navigation } from 'vue3-carousel';

  export default {
    name: 'MeditationPage',
    // Register carousal components for further use
    components: {
      Carousel,
      Slide,
      Pagination,
      Navigation
    },
  }
</script>



<style scoped>
/* Styling for the entire meditation page container */
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
  /* Styling for the meditation page title */
  #meditation-title {
    margin: 3% auto 0 auto;
    position: absolute;
    font-weight: bold;
    padding: 5px;
    font-size: calc(1em + 0.5vw); 
  }
  /* General button styling, applied to both logout and home buttons */
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
  /* Hover effect for buttons to change background color */
  .button:hover {
    background-color: rgba(75, 75, 75, 0); 
  }
  /* Positioning for the home button */
  #home-button {
    right: 5%;  
    top: 1%;
    background-color: black;
  }
  /* Logout button positioning */
  #logout {
    left: 5%;  
    top: 1%;
  }
  /* Carousel container styling */
  #carousel {
    height: 80%;
    width: 80%;
    margin-top: 10%;
  }
  /* Styling for individual carousel items */
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
  /* Padding for slides within the carousel */
  .carousel__slide {
    padding: 10px;
  }
  /* Styling for carousel navigation buttons */
  .carousel__prev, .carousel__next {
    box-sizing: content-box;
    border: 5px solid white;
  }
</style>

