<template>
  <div id="app">
    <Person username="펭수" age="20" my-address="서울"/>
    <!-- 
      my-address같은 케밥표기법으로 넘기면 받는 쪽은
      myAddress로 카멜 표기법으로 받아야함
     -->
  </div>
</template>

<script>
import Person from './components/Person.vue'

export default {
  name: 'App',
  components: {
    Person
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
