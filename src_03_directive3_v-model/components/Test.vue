<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">
    <!-- v-model: 양방향 바인딩 v-model="변수명"-->
    <!-- 
      양방향 바인딩은 input값 수정 시 
      양방향, 단반향 input값 변경 시 동시 변경 됨

      단방향 바인딩에서 input값 수정 시 변동 없음
    -->
    <span>v-model= "msg"(양방향): <input type="text" v-model="msg"></span> <!-- 양방향 바인딩 -->
    <span>v-model= "msg"(양방향):: <input type="text" v-model="msg"></span> <!-- 양방향 바인딩 -->
    <span>v-bind:value="msg"(단방향) <input type="text" v-bind:value="msg"></span> <!-- 단방향 바인딩-->
  </div>
</template>

<script>
export default {
  data() {
    return {
      msg: '펭하!!!'
    }
  },
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */
span {
  display: block;
  margin-bottom: 10px;
}
</style>
