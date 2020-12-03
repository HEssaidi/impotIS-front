import http from "../http-ws";

const getAll = () => {
  return http.get("impot/");
};

const get = id => {
  return http.get(`/tutorials/${id}`);
};

const create = data => {   ///
    console.log("create a companie in service")
  return http.post("impot/", data);
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