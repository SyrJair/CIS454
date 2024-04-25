<template>
    <!-- Main container for the shop page -->
    <div id="shop-page">
      <!-- Balance and home navigation buttons -->
      <div id="balance-button">Balance</div>
      <h1 id="shop-title">MooMeditation Shop</h1>
      <RouterLink to="/Main" id="home-button" class="button">Home</RouterLink>
      
      <div id="item-list">
        <!-- Container for displaying shop items statically -->
      <div id="item-container">
        <!-- Static display of shop items -->
        <div class="shop-item">
          <img src="../assets/chairPixel.jpg" alt="Comfy Lounge Chair" class="item-image">
          <div class="item-info">
            <h3>Bean Bag Chair</h3>
            <p>Kick back'n relax!</p>
            <p>30.00 MB</p>
            <button @click="addToCart({ id: 1, name: 'Comfy Lounge Chair', price: 30 })">Add to Cart</button>
          </div>
        </div>
  
        <div class="shop-item">
          <img src="../assets/pixelBasket.jpg" alt="Picnic Basket" class="item-image">
          <div class="item-info">
            <h3>Picnic Basket</h3>
            <p>Perfect for a nice day on the meadow.</p>
            <p>5.00 MB</p>
            <button @click="addToCart({ id: 2, name: 'Picnic Basket', price: 5 })">Add to Cart</button>
          </div>
        </div>
  
        <div class="shop-item">
          <img src="../assets/pixelHat.jpg" alt="Bucket Hat" class="item-image">
          <div class="item-info">
            <h3>Bucket Hat</h3>
            <p>Keep your head cool in style!</p>
            <p>15.00 MB</p>
            <button @click="addToCart({ id: 3, name: 'Bucket Hat', price: 15 })">Add to Cart</button>
          </div>
        </div>
      </div>
      
      </div>
      
      <!-- Cart section displaying added items and total -->
      <div id="cart">
        <h2>Your Cart</h2>
        <div v-if="cart.length > 0">
          <div class="cart-item" v-for="cartItem in cart" :key="cartItem.id">
            <h4>{{ cartItem.name }}</h4>
            <p>{{ formatNumber(cartItem.price) }}</p>
            <button @click="removeFromCart(cartItem)">Remove</button>
          </div>
          <p>Total: {{ formatNumber(total) }}</p>
          <button @click="checkout">Checkout</button>
        </div>
        <p v-else>Your cart is empty.</p>
      </div>
    </div>
  </template>
  
  
  

  <script>
export default {
  name: 'ShopPage', // Component name
  data() {
    return {
      items: [ // Array of items for sale
        { id: 1, name: 'Comfy Lounge Chair', description: 'A comfy cushion for meditation.', price: 30, image: 'cushion.jpg' },
        { id: 2, name: 'Picnic Basket', description: 'Perfect for a relaxing day in the meadows.', price: 5, image: 'incense.jpg' },
        { id: 3, name: 'Bucket Hat', description: 'Time your sessions perfectly.', price: 15, image: 'timer.jpg' }
      ],
      cart: [] // Array to hold items added to the cart
    };
  },
  methods: {
    addToCart(item) { // Method to add an item to the cart
      this.cart.push(item);
    },
    removeFromCart(item) { // Method to remove an item from the cart
      const index = this.cart.findIndex(cartItem => cartItem.id === item.id);
      if (index !== -1) {
        this.cart.splice(index, 1);
      }
    },
    checkout() { // Method to handle checkout process
      alert('Thank you for your purchase!');
      this.cart = []; // Clear cart after purchase
    },
    formatNumber(value) { // Method to format numbers as currency
      return value.toFixed(2);
    }
  },
  computed: {
    total() { // Computed property to calculate total price of cart items
      return this.cart.reduce((sum, item) => sum + item.price, 0);
    }
  }
};
</script>

  


<style>
  /* BACKGROUND + POSITIONING DETAILS BELOW HERE */
  #shop-page {
    display: flex;
    flex-direction: column;
    align-items: center;
    background-color:  #ffe3e2; 
    height:100vh;
    padding-top:20px;
  }
  #shop-title 
  {
    margin-top:20px;
    font-weight:bold;
    font-size:3em;
  }
  #balance-button, #home-button {
    padding: 10px 20px; 
    border: 1px solid #ccc;
    background-color: #f0f0f0;
    cursor: pointer;
    border-radius: 15px; 
    font-size: 1.1em; 
  }
  #balance-button {
    position: absolute;
    left: 15px;
    top:10px;
    margin:10px;
  }
  #home-button {
    color: black; 
    background-color: #f0f0f0; 
    margin: 10px;
    padding: 10px 20px;
    border: 1px solid #ccc;
    cursor: pointer;
    border-radius: 15px;
    font-size: 1.1em;
    position: absolute;
    right: 15px;
    top:15px;
}
#item-list 
{
    margin-top:5%;
}
  #item-container {
    display: flex;
    justify-content: space-around;
    flex-wrap: wrap;
  }
  .shop-item {
    /* Set item background to white so it doesn't clash with assets' white border */
    background-color: white; 
    border-radius: 8px; 
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1); 
    padding: 20px;
    margin: 20px; 
    text-align: center;
    display: flex;
    flex-direction: column;
    justify-content: space-between;
    align-items: center; 
  }
  .item-image {
    max-width: 100px;
    margin-bottom: 10px;
  }
  .item-info h3 {
    color: black;
  }
  #cart {
  background-color: white;
  border-radius: 8px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
  padding: 20px;
  margin: 20px; /* Consistent styling with shop items */
  }
  .cart-item {
    border: 1px solid #ccc;
    padding: 10px;
    margin: 10px;
  }
  button {
    background-color: #f0f0f0;
    padding: 5px 10px;
    border: none;
    cursor: pointer;
  }
  .button:hover {
    background-color: #817979; 
}
  </style>
  
  