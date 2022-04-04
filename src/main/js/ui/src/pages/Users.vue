<template>
    <q-page class="q-pa-md">
        <q-table :columns="userColumns" :rows="users" :loading="loading" :pagination="pagination">
            
        </q-table>
    </q-page>
</template>

<script lang="ts">
import { defineComponent } from 'vue';
import { api } from 'boot/axios';
import { notifyError } from 'src/utils/alerts';
import { AxiosResponse } from 'axios';

export default defineComponent({
    name: 'UserPage',
    data() {
        return {
            userColumns: [
                {
                    name: 'name',
                    label: 'Name',
                    field: 'displayName',
                    align: 'left'
                },
                {
                    name: 'createdAt',
                    label: 'Created At',
                    align: 'left'
                },
                {
                    name: 'updatedAt',
                    label: 'Updated At',
                    align: 'left'
                },
                {
                    name: 'actions',
                    label: 'Actions',
                    align: 'left'
                }
            ],
            users: [],
            loading: false,
            pagination: {
                rowsPerPage: 20
            }
        };
    },
    methods: {
        loadUsers() {
            this.loading = true;
            console.log(this.$q);
            api.get('/users')
                .then((response: AxiosResponse) => { this.users = response.data.content; })
                .catch((error: Error) => notifyError('Unable to load users', error))
                .finally(() => { this.loading = false; });
        }
    },
    mounted() {
        this.loadUsers();
    }
});
</script>