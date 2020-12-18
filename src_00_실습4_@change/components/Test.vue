<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">

    <h1>이벤트 실습</h1>
    <span>가격: <input type="text" v-model="price"></span>
    갯수:
    <select @change="sum" v-model="quantity">
      <option>10</option>
      <option>20</option>
      <option>30</option>
      <option>40</option>
    </select>
    <span>총가격: {{ total }}</span>
  </div>
</template>

<script>
export default {
  data() {
    return {
      price: "",
      quantity: "",
      total: ""
    }
  },
  methods: {
    sum: function(){
      this.total = parseInt(this.price)*parseInt(this.quantity);
    }
  }
}
</script>

<style scoped> /* 자식 CSS 구현 부분 */
span {
  display: block;
  margin-bottom: 10px;
}

</style>
