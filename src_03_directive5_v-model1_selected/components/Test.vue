<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">
    <select v-model="msg"><!-- 양방향 바인딩 -->
        <option>10</option>
        <option>20</option>
        <option>30</option>
        <option>40</option>
    </select>
    <input type="text" v-model="msg">
  </div>
</template>

<script>
export default {
  data() {
    return {
      msg: 20
    }
  },
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */



</style>
