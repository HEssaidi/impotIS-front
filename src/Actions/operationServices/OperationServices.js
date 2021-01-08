import http from "../http-ws";

const getAll = () => {
  return http.get("operations/");
};

const get = id => {
  return http.get(`/tutorials/${id}`);
};

const create = data => {   ///
    console.log("create an op in service")
  return http.post("operations/", data);
};

const update = (id, data) => {
  return http.put(`/tutorials/${id}`, data);
};

const remove = id => {
  return http.delete(`/tutorials/${id}`);
};

const removeAll = () => {
  return http.delete(`/tutorials`);
};

const findByTitle = title => {
  return http.get(`/tutorials?title=${title}`);
};

export default {
    getAll,
    get,
    create,
    update,
    remove,
    removeAll,
    findByTitle
  };