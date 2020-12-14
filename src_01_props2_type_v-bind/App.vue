<template>
  <div id="app">
    <!-- 자식(Person)에게 넘겨줄 값지정 -->
    <Person 
      username="펭수" 
      v-bind:age="20" 
      my-address="서울"
      isMarried v-bind:isMarried2 = "false"
      v-bind:phones="[100, 200, 300]"
      v-bind:author= "{
        name: 'Veronica',
        company: 'Veridian Dynamics'
      }"
    />
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
