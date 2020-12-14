<template> <!-- HTML 구현 부분 -->
  <div id="app">
    <Person/>
  </div>
</template>

<script> /*  component calss 코드 구현 부분  */
import Person from './components/Person.vue' //1. 자식 import

export default { // 다른 곳에서 사용시 VUE파일 이름으로 import
  name: 'App',
  components: {
    Person // 2. 사용 컴포넌트 등록(자식)
  },

}
</script>

<style> /*  CSS 구현 부분  */
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
