<template> <!-- HTML 구현 부분 -->
  <div id="app">
    실제 HTML 구현 되는 부분
    <!-- v-bind를 부모의 data를 자식에게 바인딩 함 v-bind:속성명="변수명", 속성명="변수명" -->
    <HelloWorld v-bind:[attributeName]="name" :age="age" v-bind:arr="array"/> <!-- 3. 자식 사용 -->
  </div>
</template>

<script> /*  component calss 코드 구현 부분  */
import HelloWorld from './components/HelloWorld.vue' //1. 자식 import

export default { // 다른 곳에서 사용시 VUE파일 이름으로 import
  name: 'App',
  components: {
    HelloWorld // 2. 사용 컴포넌트 등록(자식)
  },
  data: () => {
    return {
      name: '펭수',
      age: 10,
      array: [10, 20, 30],
      attributeName: 'username' // 속석명으로
    }
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
