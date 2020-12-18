<template><!-- 자식 HTML 구현 부분 -->
  <div class="test">
    <ul>
      <li v-for="(book, idx) in bookList" v-bind:key="idx">
        <a v-on:click="bookSelect">
          <!-- 백틱조심 -->
          <img 
          v-bind:src="require(`../assets/image/${book.img}.jpg`)"
          v-bind:data-name="book.name"
          />
          <span>{{ book.name }}</span>
        </a>
      </li>
    </ul>

  </div>
</template>

<script>
export default {
  name: 'bookList',
  props: {
    bookList: Array,
  },
  methods: {
    bookSelect: function(e){
      console.log(e.target.dataset.name);
      this.$emit("bookNameSelect", e.target.dataset.name); // 책이름전달
    }
  }
}
</script>

<style scoped>
  ul, li {
    list-style: none;
    padding: 0;
    margin: 0;
  }
  ul {
    display: flex;
    justify-content: center;
  }
  li {
    margin: 10px;
  }
  span {
    display: block;
  }
</style>

