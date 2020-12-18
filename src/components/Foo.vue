<template>
  <div class="hello">
    <h1>Foo</h1>    
    $route.params.id: {{$route.params.id}}<br>
    id:{{id}}
  </div>
</template>

<script>
export default {
 name: 'Foo',
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
