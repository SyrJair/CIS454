<template>
    <div id="shop-page">
      <button id="balance-button">Balance</button>
      <h1 id="shop-title">MooMeditation Shop</h1>
      <button id="home-button">Home</button>
      <div id="item-container">
        <div class="shop-item" v-for="item in items" :key="item.id">
          <img :src="item.image" :alt="item.name" class="item-image">
          <div class="item-info">
            <h3>{{ item.name }}</h3>
            <p>{{ item.description }}</p>
            <p>{{ formatNumber(item.price) }}</p>
            <button @click="addToCart(item)">Add to Cart</button>
          </div>
        </div>
      </div>
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
    name: 'ShopPage',
    data() {
      return {
        items: [
          { id: 1, name: 'Bean Bag Chair', description: 'A comfy cushion for meditation.', price: 30, image: 'cushion.jpg' },
          { id: 2, name: 'Picnic Basket', description: 'Soothing aroma for meditation.', price: 5, image: 'incense.jpg' },
          { id: 3, name: 'Bucket Hat', description: 'Time your sessions perfectly.', price: 15, image: 'timer.jpg' }
        ],
        cart: []
      };
    },
    methods: {
      addToCart(item) {
        this.cart.push(item);
      },
      removeFromCart(item) {
        const index = this.cart.findIndex(cartItem => cartItem.id === item.id);
        if (index !== -1) {
          this.cart.splice(index, 1);
        }
      },
      checkout() {
        alert('Thank you for your purchase!');
        this.cart = [];
      },
      formatNumber(value) {
        return value.toFixed(2);
      }
    },
    computed: {
      total() {
        return this.cart.reduce((sum, item) => sum + item.price, 0);
      }
    }
  };
  </script>
  
  <style>
  #shop-page {
    display: flex;
    flex-direction: column;
    align-items: center;
    background-color: pink; 
  }
  #shop-title {
    margin: 20px 0;
  }
  #balance-button, #home-button {
    margin: 10px;
    padding: 10px;
    border: 1px solid #ccc;
    background-color: #f0f0f0;
    cursor: pointer;
  }
  #balance-button {
    position: absolute;
    left: 10px;
  }
  #home-button {
    position: absolute;
    right: 10px;
  }
  #item-container {
    display: flex;
    justify-content: space-around;
    flex-wrap: wrap;
  }
  .shop-item {
    border: 1px solid #ccc;
    padding: 10px;
    margin: 10px;
    text-align: center;
  }
  .item-image {
    max-width: 100px;
    margin-bottom: 10px;
  }
  #cart {
    margin-top: 20px;
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
  button:hover {
    background-color: #e0e0e0;
  }
  </style>
  