<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">

    <h2>1. 기본</h2>
    <p 
      v-for="(name, index) in names" 
      v-bind:key="index + 10">
      <b>{{name}}</b>님
    </p>

    <h2>2. div태그로 그룹핑:div 태그가 흔적으로 남음</h2>
    <div 
      v-for="(name, index) in names" 
      v-bind:key="index + 100">
      <b>{{name}}</b>님
    </div>

    <h2>3. template태그로 그룹핑: template태그가 흔적으로 안남음</h2>
    <template v-for="(name, index) in names">
      <p v-bind:key="index + 1">
      <b>{{name}}</b>님
      </p>
    </template>

  </div>
</template>

<script>
export default {
  data() {
    return {
      names:['천사소녀네티','웨딩피치','세일러문']
    }
  },
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */
b {
  font-size: 20px;
  color: tomato;
}
</style>
