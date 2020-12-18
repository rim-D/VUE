<template><!-- 자식 HTML 구현 부분 -->
  <div id="xxx">
 
    <h1>v-on</h1>
    <p>디렉티브를 사용하여 DOM이벤트를 실행</p>

    <button v-on:click="handleEvent">클릭</button><br>
    <button @click="handleEvent">@click:handleEvnet</button>
    <button v-on:click="handleEvent2" data-my="100" data-my2="{'a':200,'b':300}">OK3</button>
    <button @click="xxx('홍길동')">@click="xxx('홍길동')"</button>
    <button v-on:click="xxx2('홍길동', $event)">v-on:click="xxx2('홍길동', $event)"</button>
  </div>
</template>

<script>
export default {
  methods: {
    xxx: function(e){
      console.log("xxx=============", e);
    },
    xxx2: function(data, event){
      console.log("xxx2=============", data, event);
    },
    handleEvent: function(e){
      console.log("handleEvent===", e);
    },
    handleEvent2: function(e){
      console.log("handleEvent2===", e.target.dataset.my); // 사용자 정의 데이터
      var x = JSON.parse(e.target.dataset.my2); // 문자열 json객체로 변환
      console.log(x.a, "\t", x.b);
},
  }
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */
span {
  display: block;
}
</style>
