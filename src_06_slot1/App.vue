<template> <!-- HTML 구현 부분 -->
  <div id="app">
    <Slot msg="안녕하세요">
      <!-- slot영역 -->
      <h1>슬롯</h1>
      <p slot="a">부모에서 자식으로 전달할 데이터가 문자열 정보인 경우에는 props 속성 이용.</p>
      <p slot="b">부모에서 자식으로 전달할 데이터가 HTML 태그인 경우에는 slot태그 이용</p>
      <!-- slot영역 -->
    </Slot> <!-- 3. 자식 사용 -->
  </div>
</template>

<script> /*  component calss 코드 구현 부분  */
import Slot from './components/Slot.vue' //1. 자식 import

export default { // 다른 곳에서 사용시 VUE파일 이름으로 import
  name: 'App',
  components: {
    Slot // 2. 사용 컴포넌트 등록(자식)
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
