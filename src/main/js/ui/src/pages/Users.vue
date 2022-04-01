<template>
    <q-page class="q-pa-md">
        <q-table :columns="userColumns" :rows="users" :loading="loading" :pagination="pagination">
            
        </q-table>
    </q-page>
</template>

<script lang="ts">
import { defineComponent } from 'vue';

export default defineComponent({
    name: 'UserPage',
    data() {
        return {

        };
    }
});
</script>