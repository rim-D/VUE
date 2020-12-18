<template> <!-- HTML 구현 부분 -->
  <div id="app">
    <Test v-on:handle = "y" v-on:handle2 = "y2" /><!-- 이벤트로 받아서 처리할 함수지정 -->
  </div>
</template>

<script> /*  component calss 코드 구현 부분  */
import Test from './components/Test.vue' //1. 자식 import

export default { // 다른 곳에서 사용시 VUE파일 이름으로 import
  name: 'App',
  components: {
    Test // 2. 사용 컴포넌트 등록(자식)
  },
  methods: {
    y: function(){
      console.log("부모의 y호출=========");
    },
    y2: function(v, v1){
      // 넘어오는 데이터를 매개변수로 받기
      console.log("부모의 y호출=========", v, v1);
    }
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
