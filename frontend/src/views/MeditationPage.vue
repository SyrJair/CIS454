<template>
    <div id="entire-meditation-page">
        <h1 id="meditation-title">Meditate</h1>
        <RouterLink to="/" id="logout">Logout</RouterLink>
        <RouterLink to="/Main" id="home-button">Home</RouterLink>

        <carousel :items-to-show="1.5" :wrap-around="true" :autoplay="2000" id="carousel">
            <slide v-for="slide in 10" :key="slide">
              <div class="carousel__item">{{ slide }}</div>
            </slide>
        
            <template #addons>
              <navigation />
              <pagination />
            </template>
          </carousel>
    </div>
  </template>
  
  <script>
    import 'vue3-carousel/dist/carousel.css'
    import { Carousel, Slide, Pagination, Navigation } from 'vue3-carousel'

    export default {
    name: 'App',
    components: {
    Carousel,
    Slide,
    Pagination,
    Navigation,
  },
}
  </script>

  <style>
    #entire-meditation-page
    {
        height:100vh;
        display:flex;
        justify-content:center;
        background-image:url(../assets/sunrise.jpg);
        background-repeat: none;
        background-size:contain;
        background-position:center;
        -webkit-background-filter: blur(5px);
    }
    #meditation-title
    {
        margin:3% auto 0 auto;
        position:absolute;
        font-weight:bold;
        padding:5px;
    }
    #home-button 
    {
        position:absolute;
        z-index:4;
        margin-right:93%;
        margin-top:1%;
        text-decoration:none;
        color:white;
        font-weight:bold;
    }

    #logout 
    {
        position:absolute;
        z-index: 4;
        margin-left: 93%;
        margin-top:1%;
        text-decoration:none;
        color:white;
        font-weight:bold;
        font-size:1em;
    }
    
    #carousel
    {
        height:80%;
        width:80%;
        margin-top:10%;
    }

    .carousel__item {
        min-height: 200px;
        width: 100%;
        background-color: var(--vc-clr-primary);
        color: var(--vc-clr-white);
        font-size: 20px;
        border-radius: 8px;
        display: flex;
        justify-content: center;
        align-items: center;
      }
      
      .carousel__slide {
        padding: 10px;
      }
      
      .carousel__prev,
      .carousel__next {
        box-sizing: content-box;
        border: 5px solid white;
      }
    
</style>