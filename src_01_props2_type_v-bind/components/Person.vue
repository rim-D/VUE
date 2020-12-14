<template>
  <div class="hello">
    <h1>{{ username }}</h1>
    <ul>
      <li>{{ age }}</li>
      <li>{{ myAddress }}</li>
      <li>{{ isMarried }}</li>
      <li>{{ isMarried2 }}</li>
      <li>{{ phones }}</li>
      <li>{{ author.name }}</li>
      <li>{{ author.company }}</li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'Person',
  props: { // 부모로부터 넘어 오는 값의 타입정의
    username: String,
    age: Number,
    myAddress: String, // 카멜표기법 주의
    isMarried: Boolean,
    isMarried2: Boolean, 
    phones: Array,
    author: Object
  }
}
</script>

<style scoped>
ul, li {
  margin: 0;
  padding: 0;
  list-style: none;
}

</style>
