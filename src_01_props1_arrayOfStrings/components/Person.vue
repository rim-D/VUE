<template>
  <div class="app">
    <p>{{ username }} , {{ age }} , {{ myAddress }}</p>
  </div>
</template>

<script>
export default {
  name: "app",
  props: ["username", "age", "myAddress"], // 변수명 문자열
  // props: {
  //   username: String,
  //   age: Number,
  //   myAddress: String
  // }
}
</script>

<style>
ul, li {
  list-style: none;
}
</style>