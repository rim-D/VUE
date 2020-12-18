<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">

    <h1>index없이</h1>
    <ul>
      <li v-for="name in names" :key="name">
        {{name}}
      </li>
    </ul>

    <h1>index지정</h1>
    <ul>
      <li v-for="(name, index) in names" :key="index">
        {{index + 1}} ) {{name}}
      </li>
    </ul>

    <h1>index없이</h1>
    <ul>
      <li v-for="(value, key) in person" :key="key">
        {{key}} : {{value}}
      </li>
    </ul>

    <h1>index지정</h1>
    <ul>
      <li v-for="(value, key, index) in person" :key="index">
        {{index +1}} {{key}} : {{value}}
      </li>
    </ul>

  </div>
</template>

<script>
export default {
  data() {
    return {
      names: ['펭수', '뽀로로', '차차'],
      person: {
        username: '펭수',
        age: 10,
        address: 'EBS사무실'
      }
    }
  },
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */
ul, li {
  list-style: none;
  padding: 0;
  margin: 0;
}
</style>
