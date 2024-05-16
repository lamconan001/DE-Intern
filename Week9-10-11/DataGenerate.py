import pandas as pd
import numpy as np
from faker import Faker
from pyarrow import parquet as pq
from hdfs import InsecureClient
import pyarrow as pa

# Khởi tạo Faker để sinh dữ liệu ngẫu nhiên
fake = Faker()
n = 1000000
# Sinh dữ liệu
data = {
    "Tên": [fake.name() for _ in range(n)],
    "Ngày sinh": [fake.date_of_birth() for _ in range(n)],
    "Địa chỉ": [fake.street_address() for _ in range(n)],
    "Giới tính": [np.random.choice(["Nam", "Nữ"]) for _ in range(n)],
    "Số điện thoại": [fake.phone_number() for _ in range(n)]
}

df = pd.DataFrame(data)

# Chuyển DataFrame sang Table
table = pa.Table.from_pandas(df)

# Lưu file parquet
pq.write_table(table, 'data.parquet')


