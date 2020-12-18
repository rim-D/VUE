<template> <!-- HTML 구현 부분 -->
  <div id="app">
    <Input/> <!-- 3. 자식 사용 -->
    <List/>
  </div>
</template>

<script> /*  component calss 코드 구현 부분  */
import Input from './components/Input.vue' //1. 자식 import
import List from './components/List.vue'
export default { // 다른 곳에서 사용시 VUE파일 이름으로 import
  name: 'App',
  components: {
    Input, // 2. 사용 컴포넌트 등록(자식)
    List,
  }
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
