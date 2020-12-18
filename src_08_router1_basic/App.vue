<template> <!-- HTML 구현 부분 -->
  <div id="app">
    <router-link to="/">Home</router-link>
    <router-link to="/login">Login</router-link>
    <router-view></router-view>
    <!-- 라우팅 된 컴포넌트가 보여질 부분 -->
  </div>
</template>

<script> /*  component calss 코드 구현 부분  */


export default { // 다른 곳에서 사용시 VUE파일 이름으로 import
  name: 'App',
  components: {
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
a{
  display: inline-block;
  padding: 5px;
}
</style>
