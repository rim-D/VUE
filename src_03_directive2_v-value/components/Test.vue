<template><!-- 자식 HTML 구현 부분 -->
  <div class="hello">
    v-bind:value="msg"<input type="text" v-bind:value="msg">
    :value="msg"<input type="text" :value="msg">
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
</style>
