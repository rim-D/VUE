<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">
    <h1>자식에서 부모이벤트 발생</h1>
    <button v-on:click="x">부모에게 요청</button>
    <button v-on:click="x2">부모에게 요청</button>
  </div>
</template>

<script>
export default {
  methods: {
    x: function() {
      console.log("자식 x의 this====", this);
      this.$emit("handel"); // 자식에서 부모로 전달될 이벤트 명칭(이벤트명)
    },
    x2: function() {
      console.log("자식 x2의 this====", this);
      this.$emit("handel2", 10, "펭수"); // 자식에서 부모로 전달될 이벤트 명칭(이벤트명)
    },
  }
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */

</style>
