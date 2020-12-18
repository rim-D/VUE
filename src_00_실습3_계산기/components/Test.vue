<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">

    <h1>이벤트 실습</h1>
    <span>값1: <input type="text" v-model="num1"></span>
    <span>값2: <input type="text" v-model="num2"></span>
    <button v-on:click="calc()">+</button>
    <button v-on:click="calc()">-</button>
    <button v-on:click="calc()">*</button>
    <button v-on:click="calc()">/</button><br>
    <span>결과값: {{ total }}</span>
  </div>
</template>

<script>
export default {
  data() {
    return {
      num1: "",
      num2: "",
      total: ""
    }
  },
  methods: {
    calc: function(e){
      if(action="+"){
          this.total = Number.parseInt(this.num1) + Number.parseInt(this.num2);
      } else if(action="-") {
          this.total = Number.parseInt(this.num1) - Number.parseInt(this.num2);
      } else if(action="*") {
          this.total = Number.parseInt(this.num1) * Number.parseInt(this.num2);
      } else if(action="/") {
          this.total = Number.parseInt(this.num1) / Number.parseInt(this.num2);
      }
    }
  }
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */
span {
  display: block;
  margin-bottom: 10px;
}
button {
  margin-bottom: 10px;
}
</style>
