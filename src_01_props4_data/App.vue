<template>
  <div id="app">
    <!-- data속성으로 지정한 값 출력 -->
    data x: {{ x }}, 
    data y: {{ y }}
    <Person
      username = "펭수"
      age = 5
      address = "EBS 소품실 한구석"
    />
  </div>
</template>

<script>
import Person from './components/Person.vue'

export default {
  name: 'App',
  components: {
    Person
  },
  // 로컬 상태를 저장하는 data옵션은 반드시 함수로 저장해야 한다.(arrow함수도 가능)
  data: () => {
    return { x: "펭수친구", y: "40" }
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
