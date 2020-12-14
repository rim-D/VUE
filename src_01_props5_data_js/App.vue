<template>
  <div id="app">
    <!-- data속성값 출력 -->
    <ul>
      <li><b>data username :</b> {{ username }}</li>
      <li><b>data age:</b> {{ age }} </li>
      <li><b>data array:</b> {{ array }} </li>
      <li><b>data jsonType:</b> {{ jsonType.firstname }} {{ jsonType.lastname }}</li>
      <li><b>data con:</b> {{ con.username }} {{ con.age }}</li>
    </ul>
  </div>
</template>

<script>
import { Person } from './components/Person';
export default {
  name: 'App',
  components: {

  },
  data: function() {
    return {
      username: "펭수",
      age: "10",
      array: [10, 20, 30], // array 속성값도 설정가능
      jsonType: {firstname:'peng', lastname: 'su'}, // json으로도 속성값 설정가능
      con: new Person("뽀로로", 20) // Person.js 생성자 생성 후, Person생성자 생성가능
    }
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
ul, li {
  list-style: none;
}
</style>
