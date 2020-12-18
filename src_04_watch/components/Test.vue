<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">
    <h1>watch속성</h1>
    <span>값: <input type="text" v-model="num"></span>
    <span>변경된 값: {{num}}</span>
  </div>
</template>

<script>
export default {
   data:function(){
    return{
     num:10
    }
  },
  // 1. 함수명과 data변수명이 동일해야함
  // 2. data속성이 변경되면 method와 computed는 명시적으로 호출해야하지만
  // 데이터가 변경되었을 때 함수가 자동 호출 된다.
  watch: {
    num: function(changeValue) {
      console.log("watch함수 실행====", this.num, "\t", changeValue);
    }
  }

}
</script>

<style scoped> /* 자식 CSS 구현 부분 */
span {
  display: block;
}
</style>
