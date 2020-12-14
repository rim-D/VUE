<template>
  <div>
    <p>{{ username }} , {{ age }} , {{ address }}</p>
  </div>
</template>

<script>
export default {
  name: 'Person',
  props: {
    username: String,
    age: {
      type: Number,
      default: 100 // 받는 데이터가 없을 경우의 default값지정 가능
    },
    address: {
      type: String,
      default: '제주' // 받는 데이터가 없을 경우의 default값지정 가능
    }
  }
}
</script>

<style scoped>


</style>
