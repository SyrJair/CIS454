const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  outputDir: '../target/dist'
})

// this is to set the default file path for opening the app
const path = require('@vue/cli-service')

