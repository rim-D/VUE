<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">

    <select v-model="selectedFruits">
      <option disabled selected>과일을 선택하세요</option>
      <option 
        v-for="(value, key, index) in fruits" 
        v-bind:key="index" 
        v-bind:value="value">
        {{value}}
      </option>
    </select>
    <span>선택한 과일은: {{selectedFruits}}</span>
  </div>
</template>

<script>
export default {
  data() {
    return {
      fruits: {
        apple: '사과',
        banana: '바나나',
        melon: '멜론'
      },
      selectedFruits: ''
    }
  },
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */
select {
  margin-bottom: 10px;
}
span {
  display: block;
}
</style>
