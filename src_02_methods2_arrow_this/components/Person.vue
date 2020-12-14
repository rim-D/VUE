<template><!-- 자식 HTML 구현 부분 -->
  <div class="hello">
    <h1>이름: {{username}} , 나이: {{age}}</h1>
    <p>함수 호출정보: {{sayEcho()}}</p> <!-- App.vue에서 Template에서 msg를 전달받아 바인딩함 -->
    <b>화살표 함수 Date객체 사용함</b>
    <p>현재시간: {{test()}}</p> 
  </div>
</template>

<script>
export default {
  data: function() {
    return {
      username: '펭수',
      age: 10
    }
  },
  // 메소드(함수) 작성
  methods: {
    sayEcho: function () { // 함수이름, template {{}}사용
      return this.username + "\t" + this.age;
    },
    test: () => { // 함수이름, template {{}}사용
      return new Date().toString();
    }
  },
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */
b {
  color: red;
}

</style>
